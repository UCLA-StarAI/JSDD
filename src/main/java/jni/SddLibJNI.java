package jni;

public class SddLibJNI {
  public final static native String PRIsS_get();
  public final static native String PRInsS_get();
  public final static native String PRIrcS_get();
  public final static native String PRImcS_get();
  public final static native String PRIlitS_get();
  public final static native int CONJOIN_get();
  public final static native int DISJOIN_get();
  public final static native long sdd_manager_new(long jarg1);
  public final static native long sdd_manager_create(long jarg1, int jarg2);
  public final static native long sdd_manager_copy(long[] jarg1, long jarg2);
  public final static native void sdd_manager_free(long jarg1);
  public final static native void sdd_manager_print(long jarg1);
  public final static native void sdd_manager_auto_gc_and_minimize_on(long jarg1);
  public final static native void sdd_manager_auto_gc_and_minimize_off(long jarg1);
  public final static native int sdd_manager_is_auto_gc_and_minimize_on(long jarg1);
//  public final static native void sdd_manager_set_minimize_function(long jarg1, long jarg2); // not needed in java
//  public final static native void sdd_manager_unset_minimize_function(long jarg1); // not needed in java
  public final static native long sdd_manager_options(long jarg1);
  public final static native void sdd_manager_set_options(long jarg1, long jarg2);
  public final static native int sdd_manager_is_var_used(long jarg1, long jarg2);
  public final static native long sdd_manager_vtree_of_var(long jarg1, long jarg2);
  public final static native long sdd_manager_lca_of_literals(int jarg1, long[] jarg2, long jarg3);
  public final static native long sdd_manager_var_count(long jarg1);
  public final static native void sdd_manager_var_order(long[] jarg1, long jarg2);
  public final static native void sdd_manager_add_var_before_first(long jarg1);
  public final static native void sdd_manager_add_var_after_last(long jarg1);
  public final static native void sdd_manager_add_var_before(long jarg1, long jarg2);
  public final static native void sdd_manager_add_var_after(long jarg1, long jarg2);
  public final static native void add_var_before_lca(int jarg1, long[] jarg2, long jarg3);
  public final static native void move_var_before_first(long jarg1, long jarg2);
  public final static native void move_var_after_last(long jarg1, long jarg2);
  public final static native void move_var_before(long jarg1, long jarg2, long jarg3);
  public final static native void move_var_after(long jarg1, long jarg2, long jarg3);
  public final static native void remove_var_added_last(long jarg1);
  public final static native long sdd_manager_true(long jarg1);
  public final static native long sdd_manager_false(long jarg1);
  public final static native long sdd_manager_literal(long jarg1, long jarg2);
  public final static native long sdd_apply(long jarg1, long jarg2, int jarg3, long jarg4);
//  public final static native long sdd_apply_in_vtree(long jarg1, long jarg2, int jarg3, long jarg4, long jarg5);
  public final static native long sdd_conjoin(long jarg1, long jarg2, long jarg3);
  public final static native long sdd_disjoin(long jarg1, long jarg2, long jarg3);
  public final static native long sdd_negate(long jarg1, long jarg2);
  public final static native long sdd_condition(long jarg1, long jarg2, long jarg3);
  public final static native long sdd_exists(long jarg1, long jarg2, long jarg3);
  public final static native long sdd_exists_multiple(int[] jarg1, long jarg2, long jarg3);
  public final static native long sdd_exists_multiple_static(int[] jarg1, long jarg2, long jarg3);
  public final static native long sdd_forall(long jarg1, long jarg2, long jarg3);
  public final static native long sdd_minimize_cardinality(long jarg1, long jarg2);
  public final static native long sdd_global_minimize_cardinality(long jarg1, long jarg2);
  public final static native long sdd_minimum_cardinality(long jarg1);
  public final static native java.math.BigInteger sdd_model_count(long jarg1, long jarg2);
  public final static native java.math.BigInteger sdd_global_model_count(long jarg1, long jarg2);
  public final static native int sdd_node_is_true(long jarg1);
  public final static native int sdd_node_is_false(long jarg1);
  public final static native int sdd_node_is_literal(long jarg1);
  public final static native int sdd_node_is_decision(long jarg1);
  public final static native long sdd_node_size(long jarg1);
  public final static native long sdd_node_literal(long jarg1);
  public final static native long[] sdd_node_elements(long jarg1);
  public final static native void sdd_node_set_bit(int jarg1, long jarg2);
  public final static native int sdd_node_bit(long jarg1);
  public final static native long sdd_id(long jarg1);
  public final static native int sdd_garbage_collected(long jarg1, long jarg2);
  public final static native long sdd_vtree_of(long jarg1);
  public final static native long sdd_copy(long jarg1, long jarg2);
  public final static native long sdd_rename_variables(long jarg1, long[] jarg2, long jarg3);
  public final static native int[] sdd_variables(long jarg1, long jarg2);
  public final static native long sdd_read(String jarg1, long jarg2);
  public final static native void sdd_save(String jarg1, long jarg2);
  public final static native void sdd_save_as_dot(String jarg1, long jarg2);
  public final static native void sdd_shared_save_as_dot(String jarg1, long jarg2);
  public final static native long sdd_count(long jarg1);
  public final static native long sdd_size(long jarg1);
  public final static native long sdd_shared_size(long[] jarg1, long jarg2);
  public final static native long sdd_manager_size(long jarg1);
  public final static native long sdd_manager_live_size(long jarg1);
  public final static native long sdd_manager_dead_size(long jarg1);
  public final static native long sdd_manager_count(long jarg1);
  public final static native long sdd_manager_live_count(long jarg1);
  public final static native long sdd_manager_dead_count(long jarg1);
  public final static native long sdd_vtree_size(long jarg1);
  public final static native long sdd_vtree_live_size(long jarg1);
  public final static native long sdd_vtree_dead_size(long jarg1);
  public final static native long sdd_vtree_count(long jarg1);
  public final static native long sdd_vtree_live_count(long jarg1);
  public final static native long sdd_vtree_dead_count(long jarg1);
  public final static native long sdd_vtree_size_at(long jarg1);
  public final static native long sdd_vtree_live_size_at(long jarg1);
  public final static native long sdd_vtree_dead_size_at(long jarg1);
  public final static native long sdd_vtree_size_above(long jarg1);
  public final static native long sdd_vtree_live_size_above(long jarg1);
  public final static native long sdd_vtree_dead_size_above(long jarg1);
  public final static native long sdd_vtree_count_at(long jarg1);
  public final static native long sdd_vtree_live_count_at(long jarg1);
  public final static native long sdd_vtree_dead_count_at(long jarg1);
  public final static native long sdd_vtree_count_above(long jarg1);
  public final static native long sdd_vtree_live_count_above(long jarg1);
  public final static native long sdd_vtree_dead_count_above(long jarg1);
  public final static native long sdd_vtree_new(long jarg1, String jarg2);
  public final static native long sdd_vtree_new_with_var_order(long jarg1, long[] jarg2, String jarg3);
  public final static native long sdd_vtree_new_X_constrained(long jarg1, long[] jarg2, String jarg3);
  public final static native void sdd_vtree_free(long jarg1);
  public final static native void sdd_vtree_save(String jarg1, long jarg2);
  public final static native long sdd_vtree_read(String jarg1);
  public final static native void sdd_vtree_save_as_dot(String jarg1, long jarg2);
  public final static native long sdd_manager_vtree(long jarg1);
  public final static native long sdd_manager_vtree_copy(long jarg1);
  public final static native long sdd_vtree_left(long jarg1);
  public final static native long sdd_vtree_right(long jarg1);
  public final static native long sdd_vtree_parent(long jarg1);
  public final static native int sdd_vtree_is_leaf(long jarg1);
  public final static native int sdd_vtree_is_sub(long jarg1, long jarg2);
  public final static native long sdd_vtree_lca(long jarg1, long jarg2, long jarg3);
  public final static native long sdd_vtree_var_count(long jarg1);
  public final static native long sdd_vtree_var(long jarg1);
  public final static native long sdd_vtree_position(long jarg1);
////  public final static native long sdd_vtree_location(long jarg1, long jarg2); // not needed in java
  public final static native int sdd_vtree_rotate_left(long jarg1, long jarg2, int jarg3);
  public final static native int sdd_vtree_rotate_right(long jarg1, long jarg2, int jarg3);
  public final static native int sdd_vtree_swap(long jarg1, long jarg2, int jarg3);
  public final static native void sdd_manager_init_vtree_size_limit(long jarg1, long jarg2);
  public final static native void sdd_manager_update_vtree_size_limit(long jarg1);
  public final static native int sdd_vtree_bit(long jarg1);
  public final static native void sdd_vtree_set_bit(int jarg1, long jarg2);
  public final static native long sdd_vtree_data(long jarg1);
  public final static native void sdd_vtree_set_data(long jarg1, long jarg2);
//  public final static native long sdd_vtree_search_state(long jarg1); // not needed in java
//  public final static native long sdd_vtree_set_search_state(long jarg1, long jarg2); // not needed in java
  public final static native long sdd_ref_count(long jarg1);
  public final static native long sdd_ref(long jarg1, long jarg2);
  public final static native long sdd_deref(long jarg1, long jarg2);
  public final static native void sdd_ref_multi(long jarg1, long[] jarg2);
  public final static native void sdd_deref_multi(long jarg1, long[] jarg2);
  public final static native void sdd_ref_gc_deref(long jarg1, long[] jarg2);
  public final static native void sdd_manager_garbage_collect(long jarg1);
  public final static native void sdd_vtree_garbage_collect(long jarg1, long jarg2);
  public final static native int sdd_manager_garbage_collect_if(float jarg1, long jarg2);
  public final static native int sdd_vtree_garbage_collect_if(float jarg1, long jarg2, long jarg3);
  public final static native void sdd_manager_minimize(long jarg1);
  public final static native long sdd_vtree_minimize(long jarg1, long jarg2);
  public final static native void sdd_manager_minimize_limited(long jarg1);
  public final static native long sdd_vtree_minimize_limited(long jarg1, long jarg2);
  public final static native void sdd_manager_set_vtree_search_convergence_threshold(float jarg1, long jarg2);
  public final static native void sdd_manager_set_vtree_search_time_limit(float jarg1, long jarg2);
  public final static native void sdd_manager_set_vtree_fragment_time_limit(float jarg1, long jarg2);
  public final static native void sdd_manager_set_vtree_operation_time_limit(float jarg1, long jarg2);
  public final static native void sdd_manager_set_vtree_apply_time_limit(float jarg1, long jarg2);
  public final static native void sdd_manager_set_vtree_operation_memory_limit(float jarg1, long jarg2);
  public final static native void sdd_manager_set_vtree_operation_size_limit(float jarg1, long jarg2);
  public final static native void sdd_manager_set_vtree_cartesian_product_limit(long jarg1, long jarg2);
  public final static native long wmc_manager_new(long jarg1, int jarg2, long jarg3);
  public final static native void wmc_manager_free(long jarg1);
  public final static native void wmc_set_literal_weight(long jarg1, double jarg2, long jarg3);
  public final static native double wmc_propagate(long jarg1);
  public final static native double wmc_zero_weight(long jarg1);
  public final static native double wmc_one_weight(long jarg1);
  public final static native double wmc_literal_weight(long jarg1, long jarg2);
  public final static native double wmc_literal_derivative(long jarg1, long jarg2);
  public final static native double wmc_literal_pr(long jarg1, long jarg2);

  static{
	  System.loadLibrary("sdd");
  }

}