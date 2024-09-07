package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.RemoteInput.Source
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ComposeQuadrantApp ()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    ComposeQuadrant(
        quadOneTitle = stringResource(R.string.quad_one_title),
        quadOneText = stringResource(R.string.quad_one_text),
        quadTwoTitle = stringResource(R.string.quad_two_title),
        quadTwoText = stringResource(R.string.quad_two_text),
        quadThreeTitle = stringResource(R.string.quad_three_title),
        quadThreeText = stringResource(R.string.quad_three_text),
        quadFourTitle = stringResource(R.string.quad_four_title),
        quadFourText = stringResource(R.string.quad_four_text)
    )
}

@Composable
fun ComposeQuadrant(
    quadOneTitle: String,
    quadOneText: String,
    quadTwoTitle: String,
    quadTwoText: String,
    quadThreeTitle: String,
    quadThreeText: String,
    quadFourTitle: String,
    quadFourText: String,
    modifier: Modifier = Modifier) {
    Box(

        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = quadOneTitle,
            modifier = modifier
        )
        Text(
            text = quadOneText,
            modifier = modifier
        )
        Text(
            text = quadTwoTitle,
            modifier = modifier
        )
        Text(
            text = quadTwoText,
            modifier = modifier
        )
        Text(
            text = quadThreeTitle,
            modifier = modifier
        )
        Text(
            text = quadThreeText,
            modifier = modifier
        )
        Text(
            text = quadFourTitle,
            modifier = modifier
        )
        Text(
            text = quadFourText,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}