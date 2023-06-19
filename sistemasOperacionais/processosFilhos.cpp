#include <iostream>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int taskFunction(int data) 
{
    return data * 2;
}

int main() 
{
    const int num_processes = 5;
    int data_list[num_processes] = {1, 2, 3, 4, 5};
    int results[num_processes];
    pid_t pid;

    for (int i = 0; i < num_processes; ++i) 
    {
        pid = fork();

        if (pid < 0) 
        {
            std::cerr << "Fork failed." << std::endl;
            return 1;
        } else if (pid == 0) 
        {
            int result = taskFunction(data_list[i]);
            _exit(result);  
        }
    }

    for (int i = 0; i < num_processes; ++i) 
    {
        int status;
        waitpid(pid, &status, 0);
        results[i] = WEXITSTATUS(status);
    }

    std::cout << "Results: ";
    for (int i = 0; i < num_processes; ++i) 
    {
        std::cout << results[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}
