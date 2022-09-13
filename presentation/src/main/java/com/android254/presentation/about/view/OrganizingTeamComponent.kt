package com.android254.presentation.about.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android254.presentation.R
import com.android254.presentation.common.theme.DroidconKE2022Theme

@Composable
fun OrganizingTeamComponent(
    modifier: Modifier = Modifier,
    @DrawableRes imageDrawable: Int,
    teamMemberName: String,
    teamMemberDesc: String,
) {

    Column(
        modifier = modifier
            .background(Color(0xFFFFFFFF))
            .padding(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageDrawable),
            contentDescription = "Member profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(99.dp)
                .clip(RoundedCornerShape(12.dp))
                .border(2.dp, Color(0xFF00E2C3), RoundedCornerShape(12.dp))
        )

        Spacer(Modifier.height(6.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = teamMemberName,
            style = TextStyle(
                color = Color(0xFF191D1D),
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
                lineHeight = 16.sp,
                fontFamily = FontFamily(Font(R.font.montserrat_regular)),
            ),
            textAlign = TextAlign.Center,
        )

        Spacer(Modifier.height(2.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = teamMemberDesc,
            style = TextStyle(
                color = Color(0xFF707070),
                fontWeight = FontWeight.Normal,
                fontSize = 11.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily(Font(R.font.montserrat_regular)),
            ),
            textAlign = TextAlign.Center,
        )
    }
}

@Preview
@Composable
fun Preview() {
    DroidconKE2022Theme {
        OrganizingTeamComponent(
            modifier = Modifier,
            imageDrawable = R.drawable.about_droidcon,
            teamMemberName = "Marvin Collins",
            teamMemberDesc = "Main man"
        )
    }
}