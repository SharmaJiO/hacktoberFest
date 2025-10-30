/*
Title : BFS - Graph Traversal (Hacktoberfest 2025)
Author: Your Name Here
Repo  : Add this file to your Hacktoberfest contribution
Brief : BFS for an undirected graph using adjacency list (0-based indexing).
Input : First line: n m
        Next m lines: u v
        Optional: last line source
Output: BFS order starting from source

Time Complexity : O(n + m)
Space Complexity: O(n + m)
*/

#include <bits/stdc++.h>
using namespace std;

vector<int> bfs(int n, const vector<vector<int>>& adj, int source = 0) {
    vector<int> order;
    vector<bool> visited(n, false);
    queue<int> q;
    visited[source] = true;
    q.push(source);

    while (!q.empty()) {
        int node = q.front(); q.pop();
        order.push_back(node);
        for (int nei : adj[node]) {
            if (!visited[nei]) {
                visited[nei] = true;
                q.push(nei);
            }
        }
    }
    return order;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m;
    if (!(cin >> n >> m)) return 0;
    vector<vector<int>> adj(n);
    for (int i = 0; i < m; ++i) {
        int u, v;
        cin >> u >> v;
        // If input is 1-based, uncomment:
        // --u; --v;
        adj[u].push_back(v);
        adj[v].push_back(u); // comment out for directed graphs
    }
    int source = 0;
    if (!(cin >> source)) source = 0;
    // If 1-based source input, uncomment: --source;

    vector<int> order = bfs(n, adj, source);
    cout << "BFS order:";
    for (int x : order) cout << ' ' << x;
    cout << '\n';
    return 0;
}
