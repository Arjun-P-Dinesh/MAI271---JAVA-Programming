#!/bin/bash

$done = "Commit Sucessful"
git add . && git commit -m "new commit" && git push && echo $done
