import java.util.Properties

import com.pauloneto.flickr.negocio.TesteCDI
import javax.inject.Inject

object Main extends App{


  val props = new Properties()
  props.load(getClass.getClassLoader.getResourceAsStream("flirck.properties"))
  val apiKey = props.getProperty("flickir.key")
  val method = "flickr.photos.search"
  val tags = "scala"
  val url = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"
  scala.io.Source.fromURL(url).getLines().foreach(println)
}