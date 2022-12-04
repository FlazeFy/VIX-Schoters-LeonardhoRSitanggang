package api
import res_news
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import util.Constants.Companion.API_KEY

interface news_api {
    @GET("v2/top-headlines")
    suspend fun getBreakingNewsID(
        @Query("country")
        countryCode: String = "id",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<res_news>
}