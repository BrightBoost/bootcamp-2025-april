## MacOS

Run in the terminal:
`lsof -i tcp:8080` (or another port number)

In the output, find the PID of the process running on that port, then type:

`kill -9 <PID>` e.g. `kill -9 3177`


## Windows

Run in the terminal:
`netstat -ano | findstr :8080`

Then get PID and run:

`taskkill /PID <PID>` /F e.g. `taskkill /PID 26140 /F`