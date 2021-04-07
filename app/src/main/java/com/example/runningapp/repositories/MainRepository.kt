package com.example.runningapp.repositories

import com.example.runningapp.db.Run
import com.example.runningapp.db.RunDAO
import com.example.runningapp.db.RunningDataBase
import javax.inject.Inject

class MainRepository @Inject constructor(val runDAO: RunDAO) {

    suspend fun insertRun(run: Run) = runDAO.insertRun(run)
    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)
    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()
    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()
    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()
    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()
    fun getTotalDistance() = runDAO.getTotalDistance()
    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()
    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()
    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()


}