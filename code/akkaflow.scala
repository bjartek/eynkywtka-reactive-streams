FlowGraph { implicit b ⇒
  val bcast = Broadcast[T]
  val merge = Merge[T]

  source ~> f1 ~> bcast ~> f2 ~> merge ~> f3 ~> sink
                  bcast ~> f4 ~> merge
}.run()