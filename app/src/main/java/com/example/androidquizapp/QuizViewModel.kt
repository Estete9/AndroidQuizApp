package com.example.androidquizapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class QuizViewModel : ViewModel() {

    val questionText = MutableLiveData<String>()
    val optionOne = MutableLiveData<String>()
    val optionTwo = MutableLiveData<String>()
    val optionThree = MutableLiveData<String>()
    val optionFour = MutableLiveData<String>()
    private var score = 0
    private var questionCounter = 0

    private val _navigateToResult = MutableLiveData<Boolean>()
    val navigateToResult: LiveData<Boolean>
        get() = _navigateToResult

    private val questionsList = listOf(
        Question("Who is the president of the USA", "incorrect", "correct", "incorrect", "incorrect", 2),
        Question("Who is the president of the taiwan", "correct", "incorrect", "incorrect", "incorrect", 1),
        Question("Who is the president of the Ecuador", "incorrect", "incorrect", "correct", "incorrect", 3),
        Question("Who is the president of the Chile", "incorrect", "incorrect", "incorrect", "correct", 4),
    )

    init {
        loadNextQuestion(questionCounter)
    }

    private fun loadNextQuestion(questionCounter: Int) {
        val currentQuestion = questionsList[questionCounter]
        questionText.value = currentQuestion.question
        optionOne.value = currentQuestion.optionA
        optionTwo.value = currentQuestion.optionB
        optionThree.value = currentQuestion.optionC
        optionFour.value = currentQuestion.optionD
    }

    fun onButtonClick(response: Int) {
        handleUserResponse(response)
    }

    private fun handleUserResponse(response: Int) {

        val currentQuestion = questionsList[questionCounter]
        if (response == currentQuestion.answer) {
            score++
        }

        questionCounter++

        CoroutineScope(Dispatchers.Main).launch {
            if(questionCounter < questionsList.size) {
                delay(1000L)
                loadNextQuestion(questionCounter)
            } else {
                delay(1000L)
                handleQuizCompletion()
            }
        }
    }

    private fun handleQuizCompletion() {
        _navigateToResult.value = true
    }

    fun onResultNavigated() {
        _navigateToResult.value = false
    }

    fun getScore(): Int {
        return score
    }
}