import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cars.R

@Composable
fun homescreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()) {


        Text(modifier = Modifier.fillMaxWidth(),
            text = "Welcome to Car Rental Systems(CaRS)",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif
        )

        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = "Save travel time and and stay flexible by choosing CaRS",
            color = Color.Black,
            fontSize = 15.sp,
            fontWeight = FontWeight.Light,

            fontFamily = FontFamily.Serif
        )


        Spacer(modifier = Modifier.height(10.dp))


        Text(modifier = Modifier.fillMaxWidth(),
            text = "Popular rental car choices",
            color = Color.Black,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(135.dp)
                .padding(start = 20.dp, end = 20.dp),
                    contentAlignment = Alignment.Center
                )

        {
            Image(
                painter = painterResource(id = com.example.cars.R.drawable.su),
                contentDescription = "galaxy",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)

                Text(text = "SUV RENTALS",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )

        }
        Spacer(modifier = Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(135.dp)
                .padding(start = 20.dp, end = 20.dp),
            contentAlignment = Alignment.Center
        )

        {
            Image(
                painter = painterResource(id = com.example.cars.R.drawable.passenger),
                contentDescription = "galaxy",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)

            Text(text = "PASSENGER VAN RENTALS",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)

        }
        Spacer(modifier = Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(135.dp)
                .padding(start = 20.dp, end = 20.dp),
            contentAlignment = Alignment.Center
        )

        {
            Image(
                painter = painterResource(id = com.example.cars.R.drawable.premium),
                contentDescription = "galaxy",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)

            Text(text = "PREMIUM CAR RENTALS",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)

        }



        Spacer(modifier = Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(135.dp)
                .padding(start = 20.dp, end = 20.dp),
            contentAlignment = Alignment.Center
        )

        {
            Image(
                painter = painterResource(id = com.example.cars.R.drawable.pick),
                contentDescription = "galaxy",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)

            Text(text = "PICKUP TRUCK RENTALS",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )

        }
        Spacer(modifier = Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(135.dp)
                .padding(start = 20.dp, end = 20.dp),
                contentAlignment = Alignment.Center
        )

        {
            Image(
                painter = painterResource(id = com.example.cars.R.drawable.eco),
                contentDescription = "galaxy",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)

            Text(text = "ECONOMY CAR RENTALS",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)

        }



    }
}







@Preview(showBackground = true)
@Composable
fun homescreenpreview(){
    homescreen()
}



