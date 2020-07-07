package services

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import model.{Competitor, Item, Itemb, Short, Socks, Sweater, Tracksuit}

import scala.util.Random

class PriceGenerator {
  val rndr = new Random
  val competitorsName =List("c00","c01","c02","c03","c04","c05","c06","c07","c08","c09")
 def  generatePrice(item: Item): Option[Item]={
   item match  {
     case Short(_,brand,color,size,_) =>{
       val vprice = getShortPrice(brand,color,size)
      Some( Short(brand=s"$brand",color=s"$color",size=s"$size",price=vprice).asInstanceOf[Item])
     }
     case Socks(_,brand,color,size,_) =>{
       val vprice = getSocksPrice(brand,color,size)
       Some( Socks(brand=s"$brand",color=s"$color",size=s"$size",price=vprice).asInstanceOf[Item])
     }
     case Sweater(_,brand,color,size,_) =>{
       val vprice = getSweaterPrice(brand,color,size)
       Some( Sweater(brand=s"$brand",color=s"$color",size=s"$size",price=vprice).asInstanceOf[Item])
     }
     case Tracksuit(_,brand,color,size,_) =>{
       val vprice = getTracksuitPrice(brand,color,size)
       Some( Tracksuit(brand=s"$brand",color=s"$color",size=s"$size",price=vprice).asInstanceOf[Item])
     }

   }


 }

  def getShortPrice (brand: String, color: String, size : String): Double={
    brand match {
      case "adidas" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                20d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                25d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                30d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                15d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                20d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                25d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                10d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                15d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                20d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }
      case "nike" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                30d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                31d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                33d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                18d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                22d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                25d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                11d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                19d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                23d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }
      case "reebok" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                10d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                13d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                20d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                13d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                17d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                21d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                7d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                13d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                19d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }

    }
  }
  def getSocksPrice (brand: String, color: String, size : String): Double={
    brand match {
      case "adidas" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                7d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                9d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                11d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                5d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                8d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                10d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                3d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                5d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                7d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }
      case "nike" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                9d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                11d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                13d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                7d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                9d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                11d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                6d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                8d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                10d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }
      case "reebok" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                3d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                6d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                7d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                2.50d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                3d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                4.50d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                1.99d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                2.90d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                3.30d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }

    }
  }
  def getSweaterPrice (brand: String, color: String, size : String): Double={
    brand match {
      case "adidas" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                22d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                26d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                29d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                20d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                23d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                27d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                17d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                19d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                23d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }
      case "nike" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                23d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                27d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                30d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                22d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                25d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                29d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                13d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                19d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                21d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }
      case "reebok" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                13d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                15d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                19d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                11d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                11.70d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                13d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                9d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                11d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                12.50d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }

    }
  }
  def getTracksuitPrice (brand: String, color: String, size : String): Double={
    brand match {
      case "adidas" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                45d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                58d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                60d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                43d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                50d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                55d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                32d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                40d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                43d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }
      case "nike" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                60d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                68d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                70d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                54d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                65d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                69d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                35d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                40d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                50d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }
      case "reebok" =>{
        color match {
          case "black" =>{
            size match {
              case "S" =>{
                33d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                37d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                41d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "white" =>{
            size match {
              case "S" =>{
                30d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                35d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                39d + rndr.nextInt(5).toDouble/3
              }
            }
          }
          case "blue" =>{
            size match {
              case "S" =>{
                21d + rndr.nextInt(5).toDouble/3
              }
              case "L" =>{
                25d + rndr.nextInt(5).toDouble/3
              }
              case "M" =>{
                27d + rndr.nextInt(5).toDouble/3
              }
            }
          }
        }
      }

    }
  }

  def getCompetitorPrice(item:Itemb): List[Competitor] ={
    val timestamp =  LocalDateTime.now.format(DateTimeFormatter.ofPattern("YYYYMMdd_HHmmss"))
    competitorsName.map(name => {

      val  itemName = item.name
      itemName match {
        case "short" =>{
          val vprice = getShortPrice(item.brand,item.color,item.size)
           item.price = vprice- (vprice % 0.01)
           Competitor(timestamp,name,item)
        }
        case "sweater" =>{
          val vprice = getSweaterPrice(item.brand,item.color,item.size)
          item.price = vprice- (vprice % 0.01)
          Competitor(timestamp,name,item)
        }
        case "tracksuit" =>{
          val vprice = getTracksuitPrice(item.brand,item.color,item.size)
          item.price = vprice- (vprice % 0.01)
          Competitor(timestamp,name,item)
        }
        case "socks" =>{
          val vprice = getSocksPrice(item.brand,item.color,item.size)
          item.price = vprice- (vprice % 0.01)
          Competitor(timestamp,name,item)
        }

      }

    })
  }

}
