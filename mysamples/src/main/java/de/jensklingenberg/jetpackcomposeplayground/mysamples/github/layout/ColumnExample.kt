package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.layout


import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable




@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/Column]
         */
fun ColumnDemo() {

    MaterialTheme {
        ColumnExample()
    }

}

@Composable
fun ColumnExample() {

        Column {
            Text(text = " Hello World!")
            Text(text = " Hello World!2")
        }


}