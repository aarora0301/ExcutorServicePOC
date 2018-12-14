# ExcutorServicePOC

Problem statement : There are 10 tasks, such that Task 1 has to processed first, then next 8 tasks can be executed in any order. After these tasks are finished task10 has to be executed.(Assuming a task here is just priniting on console)

Solution: ExeceutorService is used to create a thread pool of 8 threads that executes each task in parralel so that high execution speed can be achieved
