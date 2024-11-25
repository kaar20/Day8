package com.example.day8

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _counter = CounterRepository()
    private val _count = mutableStateOf(_counter.getCounter().count)
    val count: MutableState<Int> = _count

    fun increment() {
        _counter.IncrementCounter()
        _count.value = _counter.getCounter().count
    }

    fun decrement() {
        _counter.DecrementCounter()
        _count.value = _counter.getCounter().count
    }


}