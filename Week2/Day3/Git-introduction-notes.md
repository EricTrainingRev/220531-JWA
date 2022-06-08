# Intro 
Git is an incredibly popular version control software that helps developers collaborate on projects. By using git and Github, many developers can work on a single project at the same time without having access to each others computers. Git is also useful for solo work: it provides a handy way of creating "snapshots" of your work you can roll back to if every you lose your work or make a catestrophic mistake. The basic workflow for copying, modifying, and persisting the changes you make are as follows (note that this assumes you have already create a repository):
1. clone the repository you are going to be working with. If you have already done this you can skip to step 2
    - git clone repository_link_goes_here
2. Once you have finished some work, add your new content to staging using the add command
    - git add . (the period means add all new work to staging. Can also specify files and folders)
4. to commit your work you need to use the commit command
    - git commit -m "brief description of commit" (-m means you are adding a message to the commit)
5. when you are ready to push your new committed work to the repo you use the push command
    - git push