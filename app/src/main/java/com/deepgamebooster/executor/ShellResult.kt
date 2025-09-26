package com.deepgamebooster.executor

data class ShellResult(
    val stdout: String,
    val stderr: String,
    val exitCode: Int
)