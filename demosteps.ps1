pause
git checkout f0c18237df9a895b017ad9dda225b041497e2dbb --force
git log -1 --pretty=format:"%s"
pause
git checkout 6a089bfa8ad81d238fd8570dfe0a6fd6fcb2e676 --force
git log -1 --pretty=format:"%s"
pause
git checkout 897fe8b422bb4fb195a2a8060ba2c36b10905aed --force
git log -1 --pretty=format:"%s"
pause
git checkout 1c9c2b75053b811db8de6eadba07c2c6ea29e54d --force
git log -1 --pretty=format:"%s"
pause
git checkout cadd5ddc9e15d76f03f546628f03148e794a6e4c --force
git log -1 --pretty=format:"%s"
pause
git checkout a0ab44b5a4237530c823d21d8a544226748ffc80 --force
git log -1 --pretty=format:"%s"
pause
git checkout 6536c512cf95c5dddfa33b4f20f7a4793d861519 --force
git log -1 --pretty=format:"%s"
pause
git checkout 0813b334f19564fa87586e757c4c7b0248bdd7fc --force
git log -1 --pretty=format:"%s"
pause
git checkout 377ee7f90884d6acecebbb6fa501f39f5b2ecad8 --force
git log -1 --pretty=format:"%s"
pause
Invoke-Item .\pizza-backend\target\site\dependencies.html
start-sleep 1
Invoke-Item .\pizza-backend\target\site\third-party-report.html
pause
git checkout jfokus --force
git log -1
pause
