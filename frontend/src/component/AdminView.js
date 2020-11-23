import React from "react";
import {Formik} from "formik";
import * as Yup from "yup";


const AdminView = () => (
    <Formik
        initialValues={{Name: "", ID: "", DateOfBirth: ""}}
        onSubmit={(values, {setSubmitting}) => {
            setTimeout(() => {
                //LoginActions.login(values);
                console.log(values);
                setSubmitting(false);
            }, 500);
        }}

        validationSchema={Yup.object().shape({
            Name: Yup.string()
                .required("Név megadása kötelező"),
            ID: Yup.number()
                .required("Nem lehet üres!").positive().integer(),
            DateOfBirth: Yup.date()
                .required("Kötelező megadni!"),
        })}
    >
        {props => {
            const {
                values,
                touched,
                errors,
                isSubmitting,
                handleChange,
                handleBlur,
                handleSubmit
            } = props;
            return (
                <form onSubmit={handleSubmit}>
                    <div className="form-group">
                        <label htmlFor="Name">Név</label>
                        <input
                            name="Name"
                            type="text"
                            placeholder="Add meg az email címed"
                            value={values.email}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            className={ errors.Name && touched.Name ? "form-control is-invalid" : "form-control"}
                        />
                        {errors.Name && touched.Name && (
                            <div className={"invalid-feedback"}>{errors.Name} </div>
                        )}
                    </div>
                    <div className={"form-group"}>
                        <label htmlFor="ID">ID</label>
                        <input
                            name="ID"
                            type="text"
                            placeholder="Add meg az ID-t"
                            value={values.password}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            className={errors.ID && touched.ID ? "form-control is-invalid" : "form-control"}
                        />
                        {errors.ID && touched.ID && (
                            <div className={"invalid-feedback"}>{errors.ID}</div>
                        )}
                    </div>
                    <div className={"form-group"}>
                        <label htmlFor="DateofBirth">Születési Dátum</label>
                        <input
                            name="DateOfBirth"
                            type="date"
                            placeholder="Add meg a születési dátumod!"
                            value={values.password}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            className={errors.DateOfBirth && touched.DateOfBirth ? "form-control is-invalid" : "form-control"}
                        />
                        {errors.DateOfBirth && touched.DateOfBirth && (
                            <div className={"invalid-feedback"}>{errors.DateOfBirth}</div>
                        )}
                    </div>
                    <button type="submit" disabled={isSubmitting} className={"btn btn-primary"}>
                        Check in
                    </button>
                </form>
            );
        }}
    </Formik>
);
export default AdminView;