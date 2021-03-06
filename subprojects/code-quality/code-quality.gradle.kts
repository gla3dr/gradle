import org.gradle.gradlebuild.unittestandcompile.ModuleType

/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

dependencies {
    compile(library("groovy"))
    compile(project(":core"))
    compile(project(":plugins"))
    compile(project(":workers"))
    compile(project(":reporting"))

    compile(library("slf4j_api"))

    // minimal dependencies to make our code compile
    // we don't ship these dependencies because findbugs plugin will download them (and more) at runtime
    compileOnly("com.google.code.findbugs:findbugs:2.0.1")
    testRuntime("com.google.code.findbugs:bcel:2.0.1")
    testRuntime("jaxen:jaxen:1.1")
}

gradlebuildJava {
    moduleType = ModuleType.CORE
}

testFixtures {
    from(":core")
}
