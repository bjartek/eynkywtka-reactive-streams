Source(stockTickerPublisher)                 // Source[Tick]
        .filter(_.symbol == "AAPL")                // Source[Tick]
        .buffer(100000, OverflowStrategy.DropHead) // Source[Tick]
        .splitWhen(x => isNewDay(x.timeStamp))     // Source[Source[Tick]]
        .headAndTail                               // Source[(Tick, Source[Tick])]
        .map { case (head, tail) =>
            head -> tail.groupedWithin(1000, 1.second)
        }                                          // Source[(Tick, Source[Seq[[Tick]]])]
        .via(someFlow)                             // Source[RichTick]
        .map(toCandleStickChartColumn)             // Source[CandleStickChartColumn]
        .to(candleStickChartSink)                  // RunnableFlow
        .run()                                     // MaterializedMap

