:
def BFS(self) :
    current_node = self.root 
    queue = []
    r = []
    queue.append(current_node)
    while len(queue) >  0 : 
        current_node = queue.pop(0)
        r.append(current_node.value)
        if current_node.left is not None : 
            queue.append(current_node.left)
        if current_node.right is not None : 
            queue.append(current_node.right)
    return r
