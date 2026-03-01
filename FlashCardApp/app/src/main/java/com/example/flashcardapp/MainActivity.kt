import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun FlashCardApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainScreen(navController) }
        composable("kanji") { KanjiScreen() }
        composable("vocabulary") { VocabularyScreen() }
        composable("flashcards") { FlashCardsScreen() }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate("kanji") }) {            Text("Go to Kanji")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("vocabulary") }) {
            Text("Go to Vocabulary")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("flashcards") }) {
            Text("Go to Flash Cards")
        }
    }
}

@Composable
fun KanjiScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("kanji", fontSize = 32.sp)
    }
}

@Composable
fun VocabularyScreen() {
    Box(modifier = Modifier.fillMaxSize().padding(top = 40.dp), contentAlignment = Alignment.TopCenter) {
        Text("vocabulary", fontSize = 32.sp)
    }
}

@Composable
fun FlashCardsScreen() {
    Box(modifier = Modifier.fillMaxSize().padding(bottom = 40.dp), contentAlignment = Alignment.BottomCenter) {
        Text("flash cards", fontSize = 32.sp)
    }
}