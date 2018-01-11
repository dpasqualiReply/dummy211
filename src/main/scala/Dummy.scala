import org.apache.spark.sql.SparkSession

object Dummy {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().master("local[*]").appName("dummy").getOrCreate()

    val arr = spark.sparkContext.parallelize(Array(1,2,3,4,5,6,7,8,9,10))

    arr.map(a => a*100).foreach(println)

  }

}
