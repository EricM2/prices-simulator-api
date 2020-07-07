package model

case class Tracksuit(name: String="tracksuit",
                     brand: String,
                     color: String,
                     size: String,
                     price: Double =0
                    ) extends  Item
