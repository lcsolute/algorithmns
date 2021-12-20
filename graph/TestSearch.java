public class TestSearch {
	public static void main(String[] args) {
		Graph G = new Graph(new In(args[0]));
		int s = Integer.parseInt(args[1]);
		Search search = new Search(G, s);
		
		for (int i v = 0; v < G.V(); v++) {
			if (search.marked(v)) {
				System.out.println(v + " ");
			}

		System.out.println();

		if (search.count() != G.V()) {
			System.out.println("NOT ");
		}
		System.out.println("connected");
		}
	}

	/***
	 * % java TestSearch tinyG.txt 0 
	 * 0 1 2 3 4 5 6
	 * NOT connected
	 * % java TestSearch tinyG.txt 9 
	 * 9 10 11 12
	 * NOT connected
	 **/
}
