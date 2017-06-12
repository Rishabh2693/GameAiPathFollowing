1. import Project PathFinding in Folder DijkstraVsAstar into Java
2. To Run the Djikstra vs Astar Comparison
3. Click Djikstra.java and Run the File (main funct of file instantiates objects of both Astar and Dijkstra).
4. File Prints the, Comparitive Fill, Memory Footprint, time taken for each Dijkstra and Astar respectively.
5. To change Source and Goal Node,  
     LinkedList<Node> path = dijkstra.execute(graph.getNodes().get(0),graph.getNodes().get(130));
     LinkedList<Node> path2 = astar.execute(graph.getNodes().get(0),graph.getNodes().get(134));
                	(line 135 and 139)
   change values in get. First get is source and second is goal Node. Min value is 0 and max value is 39999 (In File Djikstra.java)
6. If On Running it says, No path exists, Re Run as everytime a new large graph is generated probabilistically so next Run should return a path.
7. To change the Heuristic value Edit the lines 

          total.put(source,0+diff(source,dest));(line 38)
          total.put(target, distance.get(target)+diff(target,dest));(line 55)
And Replace 'diff' with 'manhattan' or 'euclid' with same arguments in the file Astar.java
8. To Run PathFollowing, import the Project Graph_Generation in Folder PathFollowingBehaviour, and add core.jar to build path and run the file ArriveBehaviour.java. And Click any where on the screen to move the character. Clicking on the obstacles would not move the character as no path exists.
9. LargeGraph is present in file LargeGraph.java and small Graph is present in file SmallGraph.java in both the Projects
10. The implementation of Heuristics is present in file Astar.java in both projects                      
