<!--
  #%L
  admin base - UI Apps
  %%
  Copyright (C) 2017 headwire inc.
  %%
  Licensed to the Apache Software Foundation (ASF) under one
  or more contributor license agreements.  See the NOTICE file
  distributed with this work for additional information
  regarding copyright ownership.  The ASF licenses this file
  to you under the Apache License, Version 2.0 (the
  "License"); you may not use this file except in compliance
  with the License.  You may obtain a copy of the License at
  
  http://www.apache.org/licenses/LICENSE-2.0
  
  Unless required by applicable law or agreed to in writing,
  software distributed under the License is distributed on an
  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  KIND, either express or implied.  See the License for the
  specific language governing permissions and limitations
  under the License.
  #L%
  -->
<template>
  <div class="select-wrapper">
      <span class="caret">
        <i class="material-icons">arrow_drop_down</i>
      </span>
      <input 
        ref="selectInput"
        type="text" 
        class="form-control select-dropdown" 
        :value="dropdownValue"
        v-on:click="showDropdown" />
      <ul 
        :class="dropDownClasses">
        <li  
          v-if="!selectOptions.hideNoneSelectedText"
          class="disabled">
          <span>{{ selectOptions.noneSelectedText || "&lt;Nothing selected&gt;" }}</span>
        </li>
        <li 
          v-for="val in schema.values" 
          class="" 
          v-on:click="onClick(val.name, val.value)">
          <span>{{ val.name }}</span>
        </li>
      </ul>
      <div class="dropdown-bg" :style="dropDownBgStyle" v-on:click="hideDropdown"></div>
  </div>
</template>

<script>
    export default {
        props: ['model'], 
        mixins: [ VueFormGenerator.abstractField ], 
        mounted(){
          if(this.schema.selectOptions && this.schema.selectOptions.noneSelectedText){
            this.dropdownValue = this.schema.selectOptions.noneSelectedText
          }
          this.schema.values.forEach((val, index) => {
            if(val.value === this.value){
              this.dropdownValue = val.name
            }
          })
        }, 
        data() {
          return {
            dropdownValue: '< Nothing selected >',
            dropdownActive: false
          }
        }, 
        computed: {
          dropDownClasses() {
            const defaultClasses = 'dropdown-content select-dropdown'
            if(this.dropdownActive){
              return defaultClasses + ' active'
            } else {
              return defaultClasses
            }
          },

          dropDownBgStyle(){
            if(this.dropdownActive){
              return 'display: block;'
            } else {
              return ''
            }
          },

          selectOptions() {
            return this.schema.selectOptions || {} 
          }     
        },
        methods: {
          onClick(name, value){
            this.value = value
            this.dropdownValue = name
            this.dropdownActive = false
          },
          showDropdown(){
            this.dropdownActive = true
          },
          hideDropdown(){
            this.dropdownActive = false
          }
        }
    }
</script>