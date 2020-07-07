package model

case class Sweater(name: String="sweater",
                   brand: String,
                   color: String,
                   size: String,
                   price: Double =0
                  ) extends Item
