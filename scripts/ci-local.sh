#!/usr/bin/env bash
#
# Local mirror of .github/workflows/ci.yml, run by `git-manager --local-ci`
# before pushing: a pass marks the pushed commit [skip ci], so GitHub Actions
# does not spend minutes repeating it. ci.yml inlines its secret scan (this repo is
# public and cannot call project-template's private workflows), but locally the
# shared helper runs the same gitleaks check.
#
# Usage: scripts/ci-local.sh
# shellcheck source=../../project-template/scripts/ci-local-lib.sh
source "$(dirname "$0")/../../project-template/scripts/ci-local-lib.sh" || exit 1

ci_secret_scan

ci_section "compile + package (JDK 17)"
ci_use_java 17
mvn -B --no-transfer-progress verify

ci_done
