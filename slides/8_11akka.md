## AKKA-STREAM: BASIC CONCEPTS
- Built from scratch on Reactive Streams Protocol     <!-- .element: class="fragment" -->
- Java and Scala user APIs              <!-- .element: class="fragment" -->
- Supports fully general stream-graphs      <!-- .element: class="fragment" -->
- Source[T]: the open end of a pipeline producing Ts     <!-- .element: class="fragment" -->
- Sink[T]: an "end-piece" for taking in Ts                <!-- .element: class="fragment" -->
- Flow[A, B]: an unconnected piece of pipeline           <!-- .element: class="fragment" -->
- Generally, all abstractions are re-useable            <!-- .element: class="fragment" -->
- Number of pre-defined transformations still somewhat small  <!-- .element: class="fragment" -->
- Not very optimized yet, still marked "experimental"  <!-- .element: class="fragment" -->
