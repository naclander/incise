(ns incise.core-spec
    (:use
        [speclj.core]
        [incise.core]))

(describe "Truth"

    (it "is true"
        (should true))

    (it "is false"
        (should-not false))

    (it "calls functions"
        (should (testSpec))))