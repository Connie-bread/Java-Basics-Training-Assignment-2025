#!/bin/bash
# Disable Git LFS in Codespaces automatically
git lfs uninstall || true
rm -f "$(git rev-parse --git-dir)/hooks/pre-push" || true
mvn -q -DskipTests=true package || true