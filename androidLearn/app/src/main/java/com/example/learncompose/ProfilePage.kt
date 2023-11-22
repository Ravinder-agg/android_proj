package com.example.learncompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePage(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(painter = painterResource(id = R.drawable.dog),
            contentDescription = "husky",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(width = 2.dp, color = Color.Red, shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(text = "Husky Dog")
        Text(text = "Germany")

        Row (horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
            ProfileState("150", "Followers")
            ProfileState("100", "Following")
            ProfileState("30", "Posts")
        }
        Row (horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Follow User")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Direct Message")
            }
        }
    }
}
@Composable
fun ProfileState(count: String, title: String){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = title)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview(){
    ProfilePage()
}