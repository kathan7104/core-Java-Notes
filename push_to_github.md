# Instructions to Push to GitHub

## Step 1: Create the Repository on GitHub
1. Go to https://github.com/new
2. Repository name: `core java`
3. Set visibility to **Private**
4. **DO NOT** initialize with README, .gitignore, or license
5. Click "Create repository"

## Step 2: Push the Code
After creating the repository, run these commands:

```powershell
cd "C:\Users\kathan\eclipse-workspace\oops"
git remote add origin https://github.com/YOUR_USERNAME/core-java.git
git branch -M main
git push -u origin main
```

**Note:** Replace `YOUR_USERNAME` with your actual GitHub username. If your repository name has spaces, GitHub will convert it to `core-java` in the URL.

If you're using SSH instead of HTTPS:
```powershell
git remote add origin git@github.com:YOUR_USERNAME/core-java.git
```

