package com.themeclean.models;

import com.peregrine.nodetypes.models.AbstractComponent;
import com.peregrine.nodetypes.models.IComponent;
import com.peregrine.nodetypes.models.Container;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Textlinks": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "links": {
          "type": "object",
          "x-source": "inject",
          "x-form-type": "collection",
          "x-form-label": "Links",
          "properties": {
            "text": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Link Text",
              "x-form-type": "text"
            },
            "link": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Link Url",
              "x-form-type": "pathbrowser",
              "x-form-browserRoot": "/content/sites"
            }
          }
        }
      }
    }
  },
  "name": "Textlinks",
  "componentPath": "themeclean/components/textlinks",
  "package": "com.themeclean.models",
  "modelName": "Textlinks",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themeclean/components/textlinks",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class TextlinksModel extends AbstractComponent {

    public TextlinksModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"object","x-source":"inject","x-form-type":"collection","x-form-label":"Links","properties":{"text":{"type":"string","x-source":"inject","x-form-label":"Link Text","x-form-type":"text"},"link":{"type":"string","x-source":"inject","x-form-label":"Link Url","x-form-type":"pathbrowser","x-form-browserRoot":"/content/sites"}}} */
	@Inject
	private List<IComponent> links;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"object","x-source":"inject","x-form-type":"collection","x-form-label":"Links","properties":{"text":{"type":"string","x-source":"inject","x-form-label":"Link Text","x-form-type":"text"},"link":{"type":"string","x-source":"inject","x-form-label":"Link Url","x-form-type":"pathbrowser","x-form-browserRoot":"/content/sites"}}} */
	public List<IComponent> getLinks() {
		return links;
	}


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
