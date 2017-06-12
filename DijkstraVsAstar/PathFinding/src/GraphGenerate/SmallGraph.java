package GraphGenerate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SmallGraph implements Graph {
	
	
	 static List<Node> nodess;
     static List<Edge> edgess;

	SmallGraph(){
		
		nodess = new ArrayList<Node>();
        edgess = new ArrayList<Edge>();
        List<Integer> obs = new ArrayList<Integer>(); 
        obs.add(3);
        obs.add(5);
        obs.add(6);
        obs.add(11);
        obs.add(13);
        obs.add(16);
        obs.add(18);
        obs.add(21);
        obs.add(23);
        obs.add(31);
        obs.add(37);
        obs.add(38);
        obs.add(39);
        obs.add(41);
        obs.add(44);
        obs.add(55);
        obs.add(58);
        obs.add(59);
        obs.add(60);
        obs.add(61);
        obs.add(62);
        obs.add(68);
        obs.add(69);
        obs.add(75);
        obs.add(82);
        obs.add(84);
        obs.add(85);
        obs.add(87);
        obs.add(92);
        obs.add(95);
        for (int i = 0; i < 100; i++) {
            Node location = new Node(i, "Node_" + i,(int)Math.floor(i%10)*100,100*(int)Math.floor(i/10));
            nodess.add(location);
        }    	
        for(int i=0;i<100;i++){
    		
    		if(i>10&&!obs.contains(i-10)&&!obs.contains(i)){
    				addNewEdge(i,i-10,100);
    		}
    		if(i<90&&!obs.contains(i+10)&&!obs.contains(i)){
    				addNewEdge(i,i+10,100);
    		}
    		if(i%10>0&&!obs.contains(i-1)&&!obs.contains(i)){
    				addNewEdge(i,i-1,100);
    		}
    		if(i%10<9&&!obs.contains(i)&&!obs.contains(i+1)){
    				addNewEdge(i,i+1,100);
    		}
    	
        }
        
	}
	private static void addNewEdge(int sourceLocNo, int destLocNo,
            int cost) {
    Edge lane = new Edge(nodess.get(sourceLocNo), nodess.get(destLocNo), cost );
    edgess.add(lane);
	}
	public List<Node> getNodes() {
        return nodess;
	}
	public List<Edge> getEdges() {
        return edgess;
	}
	
}
