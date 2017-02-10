WinWaitActive("Authentication Required","","10")
If WinExists("Authentication Required") Then
Send("admin{TAB}")
Send("admin{Enter}")
EndIf