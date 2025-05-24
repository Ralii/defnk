# defnk!

Small macro that wraps Clojure defn and allows keyword parameter checking. It will check that the parameter name matches and that it is filled.
There is no typechecking for parameter types and no multiple arities are allowed.

Requires metosin/malli since it uses it internally

Stage: Testing internally on product app.

## Installation

![Clojars Project](https://img.shields.io/clojars/v/org.clojars.ralii/defnk.svg)

## Examples

``` clojure
(defnk! boo [{:keys [bar baz]}]
 [bar baz])
 
 (boo [bar]) => Malli error for not filling baz
 
```


## License

Copyright © 2025 Lari Saukkonen

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
