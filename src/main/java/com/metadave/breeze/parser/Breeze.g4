grammar Breeze;

/*
 * -------------------------------------------------------------------
 *
 *   Copyright (c) 2014 Dave Parfitt
 *
 *   This file is provided to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License.  You may obtain
 *   a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 * -------------------------------------------------------------------
 */

asd:          definition+;

definition:   TYPEID EQUALS type;

type:         sum_type | product_type;

product_type: fields;

sum_type:     constructor (BAR constructor)* atts?;

atts:         ATTS fields?;

constructor:  CONID fields?;

fields:       LPAREN field (COMMA field)* RPAREN;

field:        TYPEID (QUESTION | SPLAT)? id?;

id:           TYPEID | CONID;

LSQUARE:       '[';
RSQUARE:       ']';
LPAREN:        '(';
RPAREN:        ')';
COMMA:          ',';
EQUALS:        '=';
BAR:           '|';
QUESTION:      '?';
SPLAT:         '*';
ATTS:          'attributes';

TYPEID        :   [a-z][A-Za-z_0-9]*;
CONID         :   [A-Z][A-Za-z_0-9]*;

INT         :   ('-')? DIGIT+;
            
fragment DIGIT  : '0' .. '9';

WS      :       [ \t\r\n]+ -> skip;
