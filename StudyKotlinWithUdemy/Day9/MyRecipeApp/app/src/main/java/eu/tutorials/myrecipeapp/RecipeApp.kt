package eu.tutorials.myrecipeapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RecipeApp(navController: NavHostController){
    val recipeViewModel: MainViewModel = viewModel()
    val viewstate by recipeViewModel.categoriesState

    NavHost(navController = navController, startDestination = Screen.RecipeScreen.route){
        composable(route = Screen.RecipeScreen.route){
            RecipeScreen(viewstate = viewstate, navigateToDetail = {
                //BackStackEntry : 화면 이동의 흐름을 저장
                navController.currentBackStackEntry?.savedStateHandle?.set("cat",it)
                navController.navigate(Screen.DetailScreen.route)
            })
        }
        composable(route = Screen.DetailScreen.route){
            val category = navController.previousBackStackEntry?.savedStateHandle?.get<Category>("cat") ?: Category("","","","")
            CategoryDetailScreen(category = category)
        }
    }

}