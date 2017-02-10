WinWaitActive("Authentication Required","","10")
If WinExists("Authentication Required") Then
Send("admi{TAB}")
Send("admin{Enter}")
WinWaitActive("Authentication Required","","10")
Send("{ESC}")

EndIf
