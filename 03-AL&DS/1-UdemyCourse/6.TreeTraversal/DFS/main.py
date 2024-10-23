def dfs_pre_order(self) :
    r = []
    def traverse(current_node) : 
        r.append(current_node.value)
        if current_node.left is not None :
            traverse(current_node.left)
        if current_node.right is not None : 
            traverse(current_node.right)

    traverse(self.root)
    return r


def dfs_post_order(self):
    r = []
    def traverse(current_node) : 
        if current_node.left is not None : 
            traverse(current_node.left)
        if current_node.right is not None : 
            traverse(current_node.right)
        r.append(current_node.value)
    traverse(self.root)


def dfs_in_order(self) : 
    r = []
    def traverse(current_node) : 
        if current_node.left is not None : 
            traverse(current_node.left) 
        r.append(current_node.value)
        if current_node.right is not None : 
            traverse(current_node.right)
    traverse(self.root)
