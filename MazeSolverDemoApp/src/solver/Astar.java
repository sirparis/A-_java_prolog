package solver;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.essentials4j.New;

import model.Maze;

public class Astar {
	Maze maze;

	public Astar(Maze maze) {
		this.maze = maze;
	}

	public PathCostPair solve() {
		Set<ImmutablePair<Integer, Integer>> closed = new HashSet<>();
		PriorityQueue<PathCostPair> frontier = new PriorityQueue<PathCostPair>();

		List<ImmutablePair<Integer, Integer>> path = New.list(maze.getStart()); // essentials4j
		PathCostPair startNode = new PathCostPair(path, maze.getHeuristic(maze.getStart().left, maze.getStart().right));
		frontier.add(startNode);

		PathCostPair current = frontier.poll();
		ImmutablePair<Integer, Integer> currentCell = current.path.get(current.path.size() - 1);
		boolean found = true;
		while (!currentCell.equals(maze.getFinish())) {
			if (!closed.contains(currentCell)) {
				closed.add(currentCell);
				for (ImmutablePair<Integer, Integer> cell : maze.getSuccessors(currentCell)) {
					List<ImmutablePair<Integer, Integer>> newPath = New.list(current.path);
					newPath.add(cell);
					PathCostPair aSearchNode = new PathCostPair(newPath, newPath.size() - 1 + maze.getHeuristic(cell));
					frontier.add(aSearchNode);
				}
			}
			if (frontier.isEmpty()) {
				found = false;
				break;
			}
			current = frontier.poll();
			currentCell = current.path.get(current.path.size() - 1);
		}
		if (found)
			System.out.printf("A*: steps=%d, Path=%s\n", current.path.size(), current.path);
		else
			System.out.println("A*: path to solution not found");

		int numberOfVisitedCells = closed.size() + (found ? 1 : 0);
		System.out.printf("Percentage of cells visited %.2f\n",
				(double) numberOfVisitedCells * 100 / (double) (maze.getCols() * maze.getRows()));
		//maze.setVisitedCells(closed);
		return current;
	}
}