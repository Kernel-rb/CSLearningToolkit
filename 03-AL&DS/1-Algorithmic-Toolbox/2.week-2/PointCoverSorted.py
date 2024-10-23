def point_cover_sorted(points):
    points.sort()
    n = len(points)
    l = 1 
    while l < n:
        l = 2 * l
    l = l // 2
    cover = []
    i = 0
    while i < n:
        if i + l < n and points[i + l] - points[i] <= 1:
            i = i + l
            cover.append(points[i])
        else:
            l = l // 2
    return cover

print(point_cover_sorted([0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0])) 
