package model

case class Short(name: String="short",
                 brand: String,
                 color: String,
                 size: String,
                 price: Double=0
                ) extends Item
