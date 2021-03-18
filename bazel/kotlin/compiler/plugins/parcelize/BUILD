load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library", "kt_compiler_plugin")

kt_compiler_plugin(
    name = "parcelize_plugin",
    id = "org.jetbrains.kotlin.parcelize",
    compile_phase = True,
    stubs_phase = True,
    deps = [
        "@maven//:org_jetbrains_kotlin_kotlin_parcelize_compiler",
    ],
)

kt_jvm_library(
    name = "parcelize",
    srcs = [],
    exported_compiler_plugins = [":parcelize_plugin"],
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:org_jetbrains_kotlin_kotlin_parcelize_runtime",
    ]
)
