import math
graph = {
    "U": {"V": 2, "W": 5, "X": 1},
    "V": {"U": 2, "X": 2, "W": 3},
    "W": {"V": 3, "U": 5, "X": 3, "Y": 1, "Z": 5},
    "X": {"U": 1, "V": 2, "W": 3, "Y": 1},
}

def dijkstra(graph, start):
    shortest_distance = {}
    predecessor = {}
    unseenNodes = graph
    path = []

    for node in unseenNodes:
        shortest_distance[node] = math.inf
    shortest_distance[start] = 0

    while unseenNodes:
        minNode = None
        for node in unseenNodes:
            if minNode is None:
                minNode = node
            elif shortest_distance[node] < shortest_distance[minNode]:
                minNode = node

        for childNode, weight in graph[minNode].items():
            if childNode in shortest_distance and weight + shortest_distance[minNode] < shortest_distance[childNode]:
                shortest_distance[childNode] = weight + shortest_distance[minNode]
                predecessor[childNode] = minNode
        unseenNodes.pop(minNode)

    currentNode = "Z"
    while currentNode != start:
        try:
            path.insert(0, currentNode)
            currentNode = predecessor[currentNode]
        except KeyError:
            print("Path not reachable")
            break
    path.insert(0, start)
    if "Z" in shortest_distance and shortest_distance["Z"] != math.inf:
        print("Shortest path is " + str(shortest_distance["Z"]))
        print("And the path is " + str(path))


dijkstra(graph, "U")
dijkstra(graph, "V")
dijkstra(graph, "W")