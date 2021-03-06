package de.sciss.dijkstra

/** Represents an edge in a graph by holding two (2) node ids.
  *
  * @author Greg Seaton (seatongs@gmail.com)
  * @param nodeA id for the first node of the edge
  * @param nodeB id for the second node of the edge
  */
case class Edge[+S](nodeA: S, nodeB: S) {

  /** Lazy string representation of the edge; will not be instantiated until called. */
  lazy val str: String = nodeA.toString + " <-> " + nodeB.toString

  /** Overridden method to return default string representation.
    * @return lazy val str.
    */
  override def toString: String = str
}