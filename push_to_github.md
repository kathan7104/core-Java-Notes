# Instructions to Push to GitHub

**Repo:** https://github.com/kathan7104/core-Java-Notes  
**Username:** kathan7104

## Push all changes

From a terminal (PowerShell or Command Prompt), run:

```powershell
cd "d:\eclipse-workspace\oops"
git add -A
git commit -m "Add Day10Threads.java and other updates"
git push -u origin main
```

If you see **"index.lock"** or "Another git process seems to be running":
- Close any IDE/tool using this folder, then delete `d:\eclipse-workspace\oops\.git\index.lock` and run the commands again.

**Auth:** When you `git push`, use your GitHub username (`kathan7104`) and a [Personal Access Token](https://github.com/settings/tokens) (not your GitHub password).

