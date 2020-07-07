package controllers

import akka.actor.ActorSystem
import javax.inject.Inject
import model.Itemb
import play.api.mvc.{AbstractController, ControllerComponents}
import services.PriceGenerator

import scala.concurrent.{ExecutionContext, Future}
import play.api.libs.json._

class PriceController  @Inject()(cc: ControllerComponents, service: PriceGenerator)(implicit exec: ExecutionContext) extends AbstractController(cc){
  val sizes= List("S","M","L")
  val brands = List("nike","adidas","reebok")
  val colors = List("white","black","blue")
  val items = List("short","sweater","tracksuit","socks")
  def getPrices = Action.async {
      val prices = items.map(item=>{
          brands.map(brand =>{
            colors.map(color=> {
              sizes.map(size => {
                val itemb = Itemb(item,brand,color,size)
                service.getCompetitorPrice(itemb)
              })
            })
          } ).flatten.flatten.flatten

      })
    val result = Json.toJson(prices)
    Future(Ok(result))


  }

}
