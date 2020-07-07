package model

case class Socks(name: String="socks",
                 brand: String,
                 color: String,
                 size: String,
                 price: Double=0
                ) extends Item
