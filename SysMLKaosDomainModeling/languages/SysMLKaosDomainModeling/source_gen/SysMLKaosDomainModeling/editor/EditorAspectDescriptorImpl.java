package SysMLKaosDomainModeling.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0a = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt_a0a)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new AttributeAtom_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new AttributeMaplet_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Body_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new BuiltInAtom_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Concept_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new ConceptAtom_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new DataSetAtom_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new EqualityAtom_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Head_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new Individual_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new InequalityAtom_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new Predicate_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new RelationAtom_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new RelationMaplet_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new Variable_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt_a0d = concept;
    switch (index_xbvbvu_a0d.index(cncpt_a0d)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new DataValue_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new Individual_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e12L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694981fbL), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498151L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e27L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469497f85L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5dfcL), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e02L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e1cL), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498132L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f58146949821aL), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e22L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498373L), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5dc7L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694980ebL), MetaIdFactory.conceptId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f58146949821aL)).seal();
}
