Perfect 👍

I see what you’re asking: you want a stack visualization (recursive call stack) in markdown that shows how recursion unfolds in your Depth function when calculating the maximum depth.

But — in your main() you’re calling

int ans = Depth(tree.root, 0, 0);

⚠️ Problem: you don’t have a Depth(TreeNode, int, int) defined. You only have:

public static int Depth(TreeNode node)

So first, let me fix the code call:

int ans = Depth(tree.root);

Now, here’s the recursive stack visualization (for your tree) when Depth(tree.root) runs.

Your tree looks like this:

            1
         /     \
       2         3
     /   \     /   \
    4     5   7     8
                       \
                        9
                       /
                     10


⸻

Recursive Stack Visualization (Markdown)

Start

Depth(1)

Expands to left subtree
```markdown
Depth(1)
 └─ Depth(2)
      └─ Depth(4)
           └─ Depth(null) → 0
           └─ Depth(null) → 0
           → returns 1
      └─ Depth(5)
           └─ Depth(null) → 0
           └─ Depth(null) → 0
           → returns 1
      → returns max(1,1)+1 = 2
```
Then right subtree
```markdown
Depth(1)
 └─ Depth(3)
      └─ Depth(7)
           └─ Depth(null) → 0
           └─ Depth(null) → 0
           → returns 1
      └─ Depth(8)
           └─ Depth(null) → 0
           └─ Depth(9)
                └─ Depth(10)
                     └─ Depth(null) → 0
                     └─ Depth(null) → 0
                     → returns 1
                └─ Depth(null) → 0
                → returns 2
           → returns 3
      → returns max(1,3)+1 = 4
```

Final Combination
```
Depth(1)
 └─ left = 2
 └─ right = 4
 → returns max(2,4)+1 = 5
```

⸻

✅ Final Answer

Max Depth = 5


⸻

Do you want me to also draw this recursion as a stack trace table (with function arguments + return values row by row) so it looks like how the Java call stack would expand and shrink?